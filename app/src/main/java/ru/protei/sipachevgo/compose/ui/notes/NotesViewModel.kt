package ru.protei.sipachevgo.compose.ui.notes
import kotlinx.coroutines.launch

import ru.protei.sipachevgo.compose.domain.Note
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class NotesViewModel : ViewModel() {

    var selected = mutableStateOf<Note?>(null)

    val notes = mutableStateListOf<Note>(
        Note("Андроид", "операционная система, которая открыта для всех"),
        Note("Why I Love Kotlin?", "Lambdas and inline functions"),
        Note("I Love Coding", "programming is a hobby")
    )

    fun onNoteChange(title: String, text: String) {

    }

    fun onEditCompile() {

    }

    fun onNoteSelected(note: Note) {

    }

    fun onAddNoteClicked() {

    }
}

//class HomeScreenViewModel : ViewModel() {
//    var inputText by mutableStateOf("")
//        private set
//
//    fun onTextChanged(text: String) {
//        viewModelScope.launch {
//            inputText = text
//        }
//    }
//}