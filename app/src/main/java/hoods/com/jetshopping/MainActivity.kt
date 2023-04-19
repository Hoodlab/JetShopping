package hoods.com.jetshopping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import hoods.com.jetshopping.ui.JetShoppingNavigation
import hoods.com.jetshopping.ui.home.HomeScreen
import hoods.com.jetshopping.ui.theme.JetShoppingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetShoppingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetShoppingApp()
                }
            }
        }
    }

    @Composable
    fun JetShoppingApp() {
        JetShoppingNavigation()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetShoppingTheme {

    }
}