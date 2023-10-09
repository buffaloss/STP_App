package com.example.stptest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.stptest.ui.theme.AppTheme

@Composable
fun SignUpContent(navController: NavHostController?) {
    val image = painterResource(R.drawable.signup_image)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start=15.dp, end = 15.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(330.dp)
                .height(220.dp)
        )

        Text(
            text = "Welcome",
            modifier = Modifier
                .padding(end= 150.dp),
            style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold)
        )

        TextField(
            value = "", // Replace with actual state
            modifier = Modifier
                .padding(top= 50.dp)
                .border(1.5.dp, Color(0xFF49497D), shape = RoundedCornerShape(30.dp)),
            onValueChange = { /* Handle text change */ },
            label = { Text("Username") },
            colors = TextFieldDefaults.textFieldColors( // Set the text and label color
                textColor = Color.Black,
                backgroundColor = Color.White, // Set the background color
                focusedIndicatorColor = Color.Transparent, // Hide the underline when focused
                unfocusedIndicatorColor = Color.Transparent // Hide the underline when unfocused
            ),
            shape = RoundedCornerShape(30.dp) // Set the shape
        )

        TextField(
            value = "", // Replace with actual state
            modifier = Modifier
                .padding(top= 15.dp)
                .border(1.5.dp, Color(0xFF49497D), shape = RoundedCornerShape(30.dp)),
            onValueChange = { /* Handle text change */ },
            label = { Text("Phone or Email") },
            colors = TextFieldDefaults.textFieldColors( // Set the text and label color
                textColor = Color.Black,
                backgroundColor = Color.White, // Set the background color
                focusedIndicatorColor = Color.Transparent, // Hide the underline when focused
                unfocusedIndicatorColor = Color.Transparent // Hide the underline when unfocused
            ),
            shape = RoundedCornerShape(30.dp) // Set the shape
        )

        TextField(
            value = "", // Replace with actual state
            modifier = Modifier
                .padding(top= 15.dp)
                .border(1.5.dp, Color(0xFF49497D), shape = RoundedCornerShape(30.dp)),
            onValueChange = { /* Handle text change */ },
            label = { Text("Password") },
            colors = TextFieldDefaults.textFieldColors( // Set the text and label color
                textColor = Color.Black,
                backgroundColor = Color.White, // Set the background color
                focusedIndicatorColor = Color.Transparent, // Hide the underline when focused
                unfocusedIndicatorColor = Color.Transparent // Hide the underline when unfocused
            ),
            shape = RoundedCornerShape(30.dp) // Set the shape
        )


        Button(
            onClick = { /* Handle sign up */ },
            colors = ButtonDefaults.buttonColors(Color(0xFFFF4967)),
            modifier = Modifier
                .padding(top = 50.dp)
        ) {
            Text(text = "Sign Up", color = Color.White, fontSize = 15.sp)
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically // Align the children vertically
        ) {
            Text(text = "Already have an account?", fontSize = 15.sp)
            TextButton(onClick = {
                navController?.navigate("login")}
            ) {
                Text(text = "Log in", color = Color(0xFFFF4967), fontSize = 15.sp)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpContentPreview() {
    AppTheme {
        SignUpContent(navController = null)
    }
}