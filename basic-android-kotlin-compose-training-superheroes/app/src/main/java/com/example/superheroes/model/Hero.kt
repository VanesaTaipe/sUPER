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

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @DrawableRes val imageRes: Int,//Perfil
    @StringRes val nameRes: Int,//Nombre
    @StringRes val descriptionRes: Int,//heroe
    @DrawableRes val buttonLikeRes: Int,//Botton like
    @StringRes val conteLikeRes: Int,//conteo de like
    @StringRes val conteSuscrRes: Int,//Conteo de suscripcion
    @DrawableRes val imagenSuscripRes:Int,
    @StringRes val namecontentRes:Int,//Comentario nombre
    @StringRes val quiencontentRes:Int,
    @StringRes val comentarioRes:Int,
    @DrawableRes val buttonMasRes: Int
)
