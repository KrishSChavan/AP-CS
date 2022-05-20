using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Spawner : MonoBehaviour {

    GameObject b;
    GameObject c;
    Vector2 spawnPosition;

    // Start is called before the first frame update
    void Start() {
        b = GameObject.Find("Banana");
        c = GameObject.Find("Coconut");
    }

    // Update is called once per frame
    void Update() {
        float spawnX = Random.Range(Camera.main.ScreenToWorldPoint(new Vector2(0, 0)).x, Camera.main.ScreenToWorldPoint(new Vector2(Screen.width, 0)).x);
        spawnPosition = new Vector2(spawnX, 5);
        Invoke("createBanana", 1f);
        Invoke("createCoconut", 2f);
    }

    void createBanana() {
        Instantiate(b, spawnPosition, Quaternion.identity);
    }

    void createCoconut() {
        Instantiate(c, spawnPosition, Quaternion.identity);
    }
}
