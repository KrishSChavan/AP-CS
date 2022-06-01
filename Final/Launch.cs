using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Launch : MonoBehaviour {

    public Rigidbody2D rb;
    public float thrust;
    public float speed = 2;
    public bool goUp = false;

    // Start is called before the first frame update
    void Start() {
        rb = GetComponent<Rigidbody2D>();
    }

    // Update is called once per frame
    void Update() {

        if (goUp == true) {
            rb.velocity = Vector2.up * speed;
        } else {
            rb.velocity = Vector2.down * speed;
        }

        // if (Input.GetKeyDown("space")) {
        //     print("Space clicked");
        //     // rb.AddForce(0, thrust, 0, ForceMode.Impulse);
        //     transform.Translate(Vector3.forward * 2 * Time.deltaTime);
        // }
    }

    private void OnCollisionEnter2D(Collision2D col) {
        if (col.gameObject.tag == "highCheck") {
            goUp = false;
        } else if (col.gameObject.tag == "Ball") {
            goUp = true;
        }
    }

}
