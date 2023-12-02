package com.example.stptest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun SubscriptionContent(navController: NavHostController?) {
    val profile_image = painterResource(R.drawable.profile_image)
    val person_image = painterResource(R.drawable.person_image)
    val square_image = painterResource(R.drawable.square_image)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start=15.dp, end = 15.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "What's up, (UserName)",
                    modifier = Modifier
                        .padding(top= 50.dp),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_semibold))
                    )
                )
                Text(
                    text = "Where are you heading today?",
                    modifier = Modifier
                        .padding(start= 10.dp),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    )
                )            }
//            Image(
//                painter = profile_image,
//                contentDescription = "Profile Image",
//                modifier = Modifier
//                    .size(80.dp)
//                    .padding(top= 50.dp)
//                )
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            backgroundColor = Color(0xFF49497D),
            shape = RoundedCornerShape(25.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "General Subscription",
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                    )
                    Text(
                        text = "Active",
                        modifier = Modifier
                            .padding(start = 10.dp),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                    )
                    Text(
                        text = "29 days left",
                        modifier = Modifier
                            .padding(start = 10.dp, top = 0.dp),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    )                }
                Image(
                    painter = person_image,
                    contentDescription = "Person Image",
                    modifier = Modifier.size(100.dp)
                )
            }
        }

        Text(
            text = "Available Subscriptions",
            modifier = Modifier
                .padding(top= 35.dp),
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )
        )
        Text(
            text = "Manage your public transport passes",
            modifier = Modifier
                .padding(start= 0.dp),
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            )
        )

        // Repeat this Card for each subscription
        Card(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth(),
            backgroundColor = Color(0xFFFF4967),
            shape = RoundedCornerShape(25.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
               // horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEFEEEF), shape = RoundedCornerShape(15.dp))
                        .size(70.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = square_image,
                        contentDescription = "Square Image",
                        modifier = Modifier.size(40.dp)
                    )
                }

                Column {
                    Text(
                        text = "General Pass",
                        modifier = Modifier
                            .padding(top= 8.dp, start = 20.dp),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                    )
                    Text(
                        text = "Starting from 234 MDL",
                        modifier = Modifier
                            .padding(start= 20.dp),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(start = 70.dp, top = 8.dp)
                        .size(50.dp)
                        .background(Color(0xFFEDEDEE), CircleShape)
                )
            }
        }

        Card(
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(),
            backgroundColor = Color(0xFFA9A9A9),
            shape = RoundedCornerShape(25.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                // horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEFEEEF), shape = RoundedCornerShape(15.dp))
                        .size(70.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = square_image,
                        contentDescription = "Square Image",
                        modifier = Modifier.size(40.dp)
                    )
                }

                Column {
                    Text(
                        text = "General Pass",
                        modifier = Modifier
                            .padding(top= 8.dp, start = 20.dp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                    )
                    Text(
                        text = "Starting from 234 MDL",
                        modifier = Modifier
                            .padding(start= 20.dp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(start = 70.dp, top = 8.dp)
                        .size(50.dp)
                        .background(Color(0xFFEDEDEE), CircleShape)
                )
            }
        }

        Card(
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(),
            backgroundColor = Color(0xFFA9A9A9),
            shape = RoundedCornerShape(25.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                // horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEFEEEF), shape = RoundedCornerShape(15.dp))
                        .size(70.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = square_image,
                        contentDescription = "Square Image",
                        modifier = Modifier.size(40.dp)
                    )
                }

                Column {
                    Text(
                        text = "General Pass",
                        modifier = Modifier
                            .padding(top= 8.dp, start = 20.dp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                    )
                    Text(
                        text = "Starting from 234 MDL",
                        modifier = Modifier
                            .padding(start= 20.dp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(start = 70.dp, top = 8.dp)
                        .size(50.dp)
                        .background(Color(0xFFEDEDEE), CircleShape)
                )
            }
        }

        Button(
            onClick = { navController?.navigate("") },
            colors = ButtonDefaults.buttonColors(Color(0xFFFF4967)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally) // Center the button horizontally
                .padding(top = 30.dp) // Add padding
        ) {
            Text(
                text ="Special Passes",
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.poppins_semibold))
                )
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SubscriptionContentPreview() {
    SubscriptionContent(navController = null)
}