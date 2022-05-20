using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class End : MonoBehaviour
{

    GameObject monke;
    GameObject baseObj;
    Rigidbody2D rb;
    public bool end;

    void Start() {
        monke = GameObject.Find("Player");
        baseObj = GameObject.Find("Base");
        // endText = gameObject.GetComponent<Text>();
        rb = gameObject.GetComponent<Rigidbody2D>();
        end = false;
    }

    void Update() {
        if (GameObject.Find("Player") != null || end == false) {
            if (monke.GetComponent<Move>().lives == 0) {
                rb.constraints = RigidbodyConstraints2D.None;
                rb.constraints = RigidbodyConstraints2D.FreezePositionX;
                rb.gravityScale = 1.1f;

                baseObj.GetComponent<Rigidbody2D>().constraints = RigidbodyConstraints2D.None;
                baseObj.GetComponent<Rigidbody2D>().constraints = RigidbodyConstraints2D.FreezePositionX;
                baseObj.GetComponent<Rigidbody2D>().gravityScale = 1.1f;

                monke.SetActive(false);

                end = true;
            }
        } 
    }
}
