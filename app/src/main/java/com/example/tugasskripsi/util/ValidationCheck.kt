package com.example.tugasskripsi.util

import android.util.Patterns

fun validateEmail(email: String): RegisterValidation{
    if (email.isEmpty())
        return RegisterValidation.Failed("Email tidak boleh kosong")

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return RegisterValidation.Failed("Format email salah")

    return RegisterValidation.Success
}

fun validatePassword(password: String): RegisterValidation{
    if (password.isEmpty())
        return RegisterValidation.Failed("Kata sandi tidak boleh kosong")

    if (password.length < 6)
        return RegisterValidation.Failed("Kata sandi harus 6 karakter")

    return RegisterValidation.Success
}