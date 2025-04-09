/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            imageRes = R.drawable.android_superhero1,
            nameRes = R.string.Nombre,
            descriptionRes = R.string.Descripcion,
            buttonLikeRes = R.drawable.images,
            conteLikeRes  = R.string.Numerolike,
            conteSuscrRes  = R.string.Numerosuscripcion,
            imagenSuscripRes = R.drawable.like,
            namecontentRes = R.string.Comentario,
            quiencontentRes =R.string.Escrito,
            comentarioRes = R.string.Coment,
            buttonMasRes=R.drawable.mas
        )
    )
}
