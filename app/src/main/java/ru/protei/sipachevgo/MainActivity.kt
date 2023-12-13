package ru.protei.sipachevgo
//tes
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.protei.sipachevgo.ui.theme.SipachevgoTheme
import ru.protei.sipachevgo.domain.Note
import ru.protei.sipachevgo.data.SampleData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SipachevgoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NoteList(notes = SampleData.sampleNotes)
                }
            }
        }
    }
}


@Composable
fun NoteList(notes: List<Note>) {
    LazyColumn {
        items(notes) { note ->
            NoteItem(note = note)
        }
    }
}


@Composable
fun NoteItem(note: Note) {
    Text(
        text = "${note.title}\n${note.text}\n\n",

        )
}

@Preview(showBackground = true)
@Composable
fun NoteListPreview() {
    SipachevgoTheme {
        NoteList(notes = SampleData.sampleNotes)
    }
}