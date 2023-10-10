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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.stptest.ui.theme.AppTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun SignUpContent(navController: NavHostController?) {
    val image = painterResource(R.drawable.signup_image)
    var username by remember { mutableStateOf("") }
    var emailOrPhone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
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
                .padding(end= 130.dp),
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        )

        TextField(
            value = username,
            onValueChange = { newUsername ->
                // Update the state variable (username) with the new value
                username = newUsername
            },
            modifier = Modifier
                .padding(top= 50.dp)
                .border(1.5.dp, Color(0xFF49497D), shape = RoundedCornerShape(30.dp)),
            label = {
                Text(
                    text = "Username",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    )
                    ) },
            colors = TextFieldDefaults.textFieldColors( // Set the text and label color
                textColor = Color.Black,
                backgroundColor = Color.White, // Set the background color
                focusedIndicatorColor = Color.Transparent, // Hide the underline when focused
                unfocusedIndicatorColor = Color.Transparent // Hide the underline when unfocused
            ),
            shape = RoundedCornerShape(30.dp) // Set the shape
        )

        TextField(
            value = emailOrPhone,
            onValueChange = { newEmailOrPhone ->
                // Update the state variable (username) with the new value
                emailOrPhone = newEmailOrPhone
            },
            modifier = Modifier
                .padding(top=15.dp)
                .border(1.5.dp, Color(0xFF49497D), shape = RoundedCornerShape(30.dp)),
            label = { Text(
                text ="Phone or Email",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                )
            ) },
            colors = TextFieldDefaults.textFieldColors( // Set the text and label color
                textColor = Color.Black,
                backgroundColor = Color.White, // Set the background color
                focusedIndicatorColor = Color.Transparent, // Hide the underline when focused
                unfocusedIndicatorColor = Color.Transparent // Hide the underline when unfocused
            ),
            shape = RoundedCornerShape(30.dp) // Set the shape
        )

        TextField(
            value = password,
            onValueChange = { newPassword ->
                // Update the state variable (username) with the new value
                password = newPassword
            },
            modifier = Modifier
                .padding(top= 15.dp,bottom = 50.dp)
                .border(1.5.dp, Color(0xFF49497D), shape = RoundedCornerShape(30.dp)),
            label = { Text(
                text = "Password",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                )
                ) },
            colors = TextFieldDefaults.textFieldColors( // Set the text and label color
                textColor = Color.Black,
                backgroundColor = Color.White, // Set the background color
                focusedIndicatorColor = Color.Transparent, // Hide the underline when focused
                unfocusedIndicatorColor = Color.Transparent // Hide the underline when unfocused
            ),
            shape = RoundedCornerShape(30.dp), // Set the shape
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val icon = if (passwordVisibility) Icons.Default.VisibilityOff else Icons.Default.Visibility
                IconButton(
                    onClick = { passwordVisibility = !passwordVisibility }
                ) {
                    val icon: ImageVector = if (passwordVisibility) Icons.Default.VisibilityOff else Icons.Default.Visibility
                    Icon(icon, contentDescription = "Toggle Password Visibility")
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(
            onClick = { navController?.navigate("signup")  },
            colors = ButtonDefaults.buttonColors(Color(0xFFFF4967))
        ) {
            Text(
                text ="Sign up",
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.poppins_semibold))
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically // Align the children vertically
        ) {
            Text(text = "Already have an account?", fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.poppins_regular)))
            TextButton(onClick = {
                navController?.navigate("login")
            }) {
                Text(text = "Log in", color = Color(0xFFFF4967), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.poppins_semibold)) )
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