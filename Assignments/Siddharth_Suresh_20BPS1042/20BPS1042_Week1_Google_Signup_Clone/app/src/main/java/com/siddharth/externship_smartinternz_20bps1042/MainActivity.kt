package com.siddharth.externship_smartinternz_20bps1042
import com.siddharth.externship_smartinternz_20bps1042.ui.theme.Externship_SmartInternz_20BPS1042Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Externship_SmartInternz_20BPS1042Theme() {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CreateAccount()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccount() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, bottom = 100.dp, top = 100.dp)
            .fillMaxHeight()
    ) {
        Row(horizontalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)
            )
        }
        Text(text = "Create Your Google Account", fontSize = 24.sp)
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            var fname by remember {
                mutableStateOf(TextFieldValue(""))
            }
            var lname by remember {
                mutableStateOf(TextFieldValue(""))
            }
            TextField(
                value = fname,
                onValueChange = { fname = it },
                placeholder = { Text("First Name") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(end = 10.dp)
                    .border(
                        0.5.dp, color = Color.LightGray,
                        RoundedCornerShape(10.dp)
                    )
            )
            TextField(
                value = lname,
                onValueChange = { lname = it },
                placeholder = { Text("Last Name") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .border(
                        0.5.dp, color = Color.LightGray,
                        RoundedCornerShape(10.dp)
                    )
            )
        }
        Row {
            var uname by remember {
                mutableStateOf(TextFieldValue(""))
            }
            TextField(
                value = uname,
                onValueChange = { uname = it },
                placeholder = { Text("Username") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        0.5.dp, color = Color.LightGray,
                        RoundedCornerShape(10.dp)
                    )
            )
        }
        Text(text = "You can letters, numbers and full stops.", fontSize = 12.sp, color = Color.Gray, modifier = Modifier.padding(start = 10.dp))
        Button(onClick = { },
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Transparent),
        ) {
            Text(text = "Use my current email address instead", color = Color(27, 102, 201))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            var pass by remember {
                mutableStateOf(TextFieldValue(""))
            }
            var pass2 by remember {
                mutableStateOf(TextFieldValue(""))
            }
            TextField(
                value = pass,
                onValueChange = { pass = it },
                placeholder = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(end = 10.dp)
                    .border(
                        0.5.dp, color = Color.LightGray,
                        RoundedCornerShape(10.dp)
                    ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
            )
            TextField(
                value = pass2,
                onValueChange = { pass2 = it },
                placeholder = { Text("Confirm") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .border(
                        0.5.dp, color = Color.LightGray,
                        RoundedCornerShape(10.dp)
                    )
            )
        }
        Text(text = "Use 8 or more characters with a mix of letters, numbers & symbols")
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            var isChecked by remember {
                mutableStateOf(false)
            }
            Checkbox(checked = isChecked, onCheckedChange = { isChecked = it })
            Text(text = "Show password")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor =Color.Transparent,contentColor= Color(27, 102, 201))) {
                Text(text = "Sign in instead")
            }
            Button(onClick = {},
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(27, 102, 201), contentColor = Color.White)) {
                Text(text = "Next")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateAccountPreview() {
    Externship_SmartInternz_20BPS1042Theme() {
        CreateAccount()
    }
}