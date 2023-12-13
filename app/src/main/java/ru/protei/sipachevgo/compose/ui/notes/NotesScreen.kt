package ru.protei.sipachevgo.compose.ui.notes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.Button
import androidx.compose.runtime.remember
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.material3.TextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesScreen(vm: NotesViewModel) {
    MyCustomButton(" + ") {

    }
}
@Composable
fun MyCustomButton(label: String, onClick: () -> Unit) {
    Button(onClick) {
        Text(label)
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatefulTextField(
    text: String,
    onTextChanged: (String) -> Unit,
) {
    var state by remember { mutableStateOf(text) }
    TextField(
        value = state,
        onValueChange = {
            state = it
            onTextChanged(it)
        }
    )
}

