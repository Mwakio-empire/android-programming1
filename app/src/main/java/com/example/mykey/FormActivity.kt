package com.example.mykey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mykey.ui.theme.MykeyTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Form()

        }
    }
}

@Composable
fun Form( ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.background),
                contentScale = ContentScale.FillBounds
            )
    ) {
        var firstname by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var contact by remember { mutableStateOf("") }


//centering the image
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.register),
                contentDescription = "register",
                modifier = Modifier.size(100.dp)
            )
            //end of centering
        }
        androidx.compose.material3.Text(text = "Create an account",
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()

                .height(30.dp) ,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.Green

        )
        Spacer(modifier = Modifier.height(20.dp))

       TextField(value = firstname, onValueChange = {firstname = it},
           placeholder = { androidx.compose.material3.Text(text = "Enter firstname")},
           leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "PERSON")},
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
       )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = lastname, onValueChange = {lastname = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "PERSON")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))


        TextField(value = email, onValueChange = {email = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "PERSON")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = password, onValueChange = {password = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "PERSON")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = contact, onValueChange = {contact = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter contact")},
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "PERSON", )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red), modifier = Modifier

                .padding(start = 30.dp, end = 30.dp)
        ){
            Text(text = "Register")
        }







    }

}



@Preview(showBackground = true)
@Composable
fun FormPreview(){
    Form()
}