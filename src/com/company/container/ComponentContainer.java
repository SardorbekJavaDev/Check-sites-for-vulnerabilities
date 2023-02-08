package com.company.container;

import com.company.controller.TasksController;

import java.util.Scanner;

public interface ComponentContainer {
		Scanner scanner = new Scanner(System.in);
		TasksController tasksController = new TasksController();
}
