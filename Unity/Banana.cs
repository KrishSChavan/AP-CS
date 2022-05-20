using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Banana : MonoBehaviour
{

    public int num;
    public bool isCol = false;

    // Start is called before the first frame update
    void Start()
    {
        num = 0;
        // Vector2 spawnPosition = new Vector2(-2, 4);
        // Instantiate(GameObject.Find("Banana"), spawnPosition, Quaternion.identity);
    }

    // Update is called once per frame
    void Update()
    {
        
    }


    private void OnCollisionEnter2D(Collision2D col) { 
        if (col.gameObject.tag == "Player" && isCol == false) {
            isCol = true;
            // print("Yo I collided with player bruh");
            Destroy(gameObject);
            col.gameObject.GetComponent<Move>().score += 1;
        } 
        else if (col.gameObject.tag == "Ground" && isCol == false) {
            isCol = true;
            Destroy(gameObject);
        }
    }

}
