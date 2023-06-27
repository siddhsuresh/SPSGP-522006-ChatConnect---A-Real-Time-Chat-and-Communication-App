package com.example.chatconnect.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatconnect.R
import com.example.chatconnect.view.ui.theme.ChatConnectTheme

@Composable
fun AuthenticationView(register: () -> Unit, login: () -> Unit) {
    ChatConnectTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colorScheme.background) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color(32, 35, 43)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Title(title = "Chat Connect")
                Card(
                    shape = RoundedCornerShape(topEnd =  80.dp, topStart = 80.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                ) {
                    Column(
                        Modifier.background(Color(91, 82, 101))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Enjoy the new Experience of chatting with global friends",
                                fontSize = 28.sp,
                                color= Color(221, 208, 242),
                                style = TextStyle(lineHeight = 35.sp, textAlign = TextAlign.Center),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(5.dp)
                            )
                            Text(
                                text = "Connect people around the world for free",
                                fontSize = 15.sp,
                                color= Color.White,
                                modifier = Modifier.padding(5.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Bottom
                        ) {
                            Buttons(title = "Register", onClick = register)
                            Buttons(title = "Login", onClick = login)
                        }
                    }
                }
            }
        }
    }
}
