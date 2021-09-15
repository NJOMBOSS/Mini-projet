package com.example.shelldistant.service;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public interface ConnectionService {
    Session getSession() throws JSchException;
}