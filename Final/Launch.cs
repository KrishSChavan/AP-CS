using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Launch : MonoBehaviour {

    public float moveSpeed = 5f;

    // Start is called before the first frame update
    void Start() {
        
    }

    // Update is called once per frame
    void Update() {

    }

    private void OnCollisionEnter2D(Collision2D col) {
        if (col.gameObject.tag == "Ball") {
            Vector3 movement = new Vector3(Input.GetAxis("Horizontal"), 0f, 0f);
            transform.position += movement * Time.deltaTime * moveSpeed;
            // transform.position = new Vector3(11.25f, -1.0f, 0.0f);
        }
    }

}
