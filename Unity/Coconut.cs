using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Coconut : MonoBehaviour
{

    public bool isCol = false;
    public GameObject[] hearts;

    // Start is called before the first frame update
    void Start() {
        hearts = GameObject.FindGameObjectsWithTag("Heart");
    }

    // Update is called once per frame
    void Update() {
        
    }

    private void OnCollisionEnter2D(Collision2D col) { 
        if (col.gameObject.tag == "Player" && isCol == false) {
            isCol = true;
            Destroy(gameObject);
            col.gameObject.GetComponent<Move>().lives -= 1;
            Destroy(hearts[col.gameObject.GetComponent<Move>().lives]);
            // if (col.gameObject.GetComponent<Move>().lives == 0) {
            //     Destroy(col.gameObject.GetComponent<Move>());
            //     Destroy(col.gameObject);
            // }
        } else if (col.gameObject.tag == "Ground" && isCol == false) {
            isCol = true;
            Destroy(gameObject);
        }
    }
}
