package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ResultsHeader() {
    Card(

    ) {

        Column(

        ) {
            Column(

            ) {
                Text(text= "$27.89")

                Text(text = "Total per person")
            }

            Row(

            ) {
                Column(

                ) {
                    Text(
                        text = "$3.64"
                    )

                    Text(
                        text = "Tip per person"
                    )
                }

                Column(

                ) {
                    Text(
                        text = "$55.78"
                    )

                    Text(
                        text = "Bill total"
                    )
                }
            }

        }
    }
}

@Composable
fun BillTotalInput() {
    Column(

    ) {
        Text(
            text = "Bill",
            style = TextStyle(
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .padding(10.dp)
        )

        OutlinedTextField(
            value = "",
            singleLine = true,
            trailingIcon = { Icon(imageVector = Icons.Default.AttachMoney, contentDescription = null) },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp),
            onValueChange = {}
        )
    }
}

@Composable
fun NumberOfPeopleInput() {
    Column(

    ) {
        Text(
            text = "People",
            style = TextStyle(
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .padding(10.dp)
        )

        OutlinedTextField(
            value = "",
            singleLine = true,
            trailingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp),
            onValueChange = {}
        )
    }
}

@Composable
fun TipSelect() {
    Column(

    ) {
        Text(
            text = "Slect Tip %",
            style = TextStyle(
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .padding(10.dp)
        )

        Row(

        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.LightGray
                ),
                modifier = Modifier
                    .padding(start = 10.dp, end = 5.dp)
                    .weight(1f),
                onClick = {}
            ){
                Text(text = "5%")
            }

            Button(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .weight(1f),
                onClick = {}
            ){
                Text(text = "10%")
            }

            Button(
                modifier = Modifier
                    .padding(start = 5.dp, end = 10.dp)
                    .weight(1f),
                onClick = {}
            ){
                Text(text = "15%")
            }
        }

        Row(

        ) {
            Button(
                modifier = Modifier
                    .padding(start = 10.dp, end = 5.dp)
                    .weight(1f),
                onClick = {}
            ){
                Text(text = "20%")
            }

            Button(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .weight(1f),
                onClick = {}
            ){
                Text(text = "25%")
            }

            Button(
                modifier = Modifier
                    .padding(start = 5.dp, end = 10.dp)
                    .weight(1f),
                onClick = {}
            ){
                Text(text = "Custom")
            }
        }
    }
}

@Composable
fun BillInputs() {

    var tip by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Column(

        ) {
            BillTotalInput()
            NumberOfPeopleInput()
            TipSelect()
        }
    }
}