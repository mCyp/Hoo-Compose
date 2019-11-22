package com.orient.compose.ui.login

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.ParagraphStyle
import androidx.ui.text.TextStyle
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import com.orient.compose.R
import com.orient.compose.ui.lightThemeColors
import com.orient.compose.ui.themeTypography

@Preview
@Composable
fun welcomeScreen() {
    MaterialTheme(
        colors = lightThemeColors,
        typography = themeTypography
    ) {
        val welcomeImg = +imageResource(R.drawable.welcome_bg)
        Column(
            mainAxisSize = LayoutSize.Expand, modifier = Spacing(20.dp)
            , crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            Container(modifier = AspectRatio(1.0f), expanded = true) {
                DrawImage(image = welcomeImg)
            }

            Text(
                text = "Hoo is a App about sneakers.\n If you want to learn more about sneakers \n Let's Begin"
                , style = TextStyle(color = Color.Black, fontSize = 18.sp)
                , paragraphStyle = ParagraphStyle(textAlign = TextAlign.Center)
            )


            HeightSpacer(height = 20.dp)

            Button(text = "HAVE A ACCOUNT ? LOGIN", onClick = {

            })

            HeightSpacer(height = 20.dp)

            Button(text = "JOIN US"
                , onClick = {

            })


        }
    }
}