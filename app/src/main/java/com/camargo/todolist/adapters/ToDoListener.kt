package com.camargo.todolist.adapters

import com.camargo.todolist.model.ToDo

interface ToDoListener {
    fun onItemClick(todo: ToDo)

    fun onLongClick(todo: ToDo)
}