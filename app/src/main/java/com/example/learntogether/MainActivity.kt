package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()) {
                    GreetingCard(
                        title = stringResource(R.string.jetpack_compose_tutorial_title),
                        paragraph1 = stringResource(R.string.jetpack_compose_tutorial_para1),
                        paragraph2 = stringResource(R.string.jetpack_compose_tutorial_para2)
                    )

                }
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun GreetingCard(title: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        // L'image en haut, sur toute la largeur
        GreetingImage()
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = paragraph1,
            textAlign = TextAlign.Justify,
            style = LocalTextStyle.current.copy(letterSpacing = 0.sp), // neutralise le letterSpacing hérité
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            style = LocalTextStyle.current.copy(letterSpacing = 0.sp), // neutralise le letterSpacing hérité
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    locale = "fr",
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        GreetingCard(
            title = stringResource(R.string.jetpack_compose_tutorial_title),
            paragraph1 = stringResource(R.string.jetpack_compose_tutorial_para1),
            paragraph2 = stringResource(R.string.jetpack_compose_tutorial_para2),
        )
    }
}