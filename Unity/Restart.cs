using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Restart : MonoBehaviour
{

    GameObject endScreen;

    // Start is called before the first frame update
    void Start() {
        endScreen = GameObject.Find("endScreen");
    }

    // Update is called once per frame
    void Update() {
        if (endScreen.GetComponent<End>().end == true && Input.GetButtonDown("Jump")) {
            SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex);
        }
    }

}
