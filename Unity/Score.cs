using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Score : MonoBehaviour
{

    GameObject monke;
    public Text myText;

    // Start is called before the first frame update
    void Start() {
        monke = GameObject.Find("Player");
    }

    // Update is called once per frame
    void Update() {
        if (GameObject.Find("Monkey") != null) {
            myText.text = monke.GetComponent<Move>().score + "";
        }
    }

}
