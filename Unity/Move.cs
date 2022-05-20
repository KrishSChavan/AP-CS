using System.Collections;
using System.Collections.Generic;
using UnityEngine;
public class Move : MonoBehaviour
{
    public float moveSpeed = 5f;
    public bool isGrounded = false;
    public int score;
    public Vector3 move;
    public int lives;

    public SpriteRenderer spriteRenderer;



    private void Start() {
        score = 0;
        lives = 3;
        spriteRenderer = gameObject.GetComponent<SpriteRenderer>(); 
    }

    private void Update() {
        Jump();
        Vector3 movement = new Vector3(Input.GetAxis("Horizontal"), 0f, 0f);

        if (movement.x > 0) {
            spriteRenderer.sprite = Resources.Load<Sprite>("Monkey Right");
        } else if (movement.x < 0) {
            spriteRenderer.sprite = Resources.Load<Sprite>("Monkey Left");
        }

        move = movement;
        transform.position += movement * Time.deltaTime * moveSpeed;
    }

    void Jump() {
        if (Input.GetButtonDown("Jump") && isGrounded == true) {
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(0f, 5f), ForceMode2D.Impulse);
            isGrounded = false;
        }
    }

}
