using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class EndText : MonoBehaviour
{

    GameObject endScreen;
    public Text endText;

    // Start is called before the first frame update
    void Start() {
        endScreen = GameObject.Find("endScreen");
    }

    // Update is called once per frame
    void Update() {
        if (endScreen.GetComponent<End>().end == true) {
            Invoke("ChangeText", 1f);
        }
    }

    void ChangeText() {
      endText.text = "Press Space to Restart";
      //my code here after 3 seconds
    }

}
