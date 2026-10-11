package com.example.pabhomework.myfirstcomposeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pabhomework.R

@Composable
fun FirstScreen() {
    // Tugas 3: Wrap Column dengan Surface menggunakan warna pilihan (misal: Color(0xFFE8F0FE) atau Color.LightGray)
    Surface(color = Color(0xFFE8F0FE)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp) // Jarak padding akhir yang dipilih (Tugas 3)
        ) {
            // Tugas 1: Salam dan deskripsi singkat ide aplikasi
            Text(text = "Hi! I am Ayu.")
            Text(text = "My idea: a Student Task Tracker.")

            // Tugas 2: Menggunakan gambar sendiri dan contentDescription deskriptif
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Profile illustration of student task tracker concept"
            )
        }
    }
}