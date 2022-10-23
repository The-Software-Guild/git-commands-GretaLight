/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics;

/**
 *
 * @author Greta
 */
public class CommentingCode {
     public static void main(String[] args) {

        System.out.println("/* A multiple line comments */");
        System.out.println("// Single line comments");// do not execute!

        // Comments can be on their own line
        System.out.println("/** comments a doc */"); // or they can share like this

        // However if you put the // BEFORE a line of code
        // System.out.println("Then it is considered a comment");
        // System.out.println("and it won't execute!");
    }
}
