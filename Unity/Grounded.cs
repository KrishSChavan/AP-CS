using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Grounded : MonoBehaviour
{

    GameObject monke;

    // Start is called before the first frame update
    void Start() {
        monke = gameObject.transform.parent.gameObject;
    }

    // Update is called once per frame
    void Update() {
        
    }


    private void OnCollisionEnter2D(Collision2D collision) {
        if (collision.collider.tag == "Ground") {
            monke.GetComponent<Move>().isGrounded = true;
        }
    }


}
