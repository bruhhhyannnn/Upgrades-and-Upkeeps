package com.example.carpenterto_doapplication.data_model

data class TaskModel(
    var reportId : Int,
    var dateGenerated : String = "",
    var timeGenerated : String = "",
    var fullName : String = ""
)