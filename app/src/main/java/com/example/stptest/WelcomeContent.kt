package com.example.stptest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.stptest.ui.theme.AppTheme

@Composable
fun WelcomeContent(name: String, modifier: Modifier = Modifier,navController: NavHostController?) {
    val image = painterResource(R.drawable.welcome_image)
    //var username by remember { mutableStateOf("") }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 0.dp)
                .size(400.dp) // Adjust the size as needed
        )

        Text(
            text = "Make things easier with $name",
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .align(Alignment.CenterHorizontally),
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            ),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            lineHeight = 40.sp
        )

        Text(
            text = "$name is a free public transport subscription manager",
            modifier = Modifier
                .padding(horizontal = 70.dp)
                .align(Alignment.CenterHorizontally),
            style = TextStyle(
                fontFamily = FontFamily(Font(R.font.poppins_light))),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            lineHeight = 20.sp
        )

        // "Sign Up" Button
        Button(
            onClick = {
                navController?.navigate("signup")
            },
            colors = ButtonDefaults.buttonColors(Color(0xFFFF4967)),
            modifier = Modifier
                .padding(top = 50.dp)
        ) {
            Text(
                text = "Sign Up",
                color = Color.White,
                fontSize = 15.sp,
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)))
            )
        }

        TextButton(
            onClick = {
                navController?.navigate("login")
            },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Log in",
                color = Color(0xFFFF4967),
                fontSize = 15.sp,
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)))
            )
        }

//        Button for quick access to Susbscriptions page for testing purposes:

//        TextButton(
//            onClick = {
//                navController?.navigate("subscriptions")
//            },
//            modifier = Modifier
//                .padding(start = 20.dp, end = 20.dp)
//        ) {
//            Text(text = "Test Subscriptions page",
//                color = Color.Black,
//                fontSize = 15.sp,
//                style = TextStyle(
//                    fontFamily = FontFamily(Font(R.font.poppins_semibold)))
//            )
//        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPagePreview() {
    AppTheme {
        WelcomeContent(name = "AppName", navController = null)
    }
}