package com.wipro.piramal.service;

import org.springframework.stereotype.Service;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

@Service
public class SftpConnector {

	public boolean moveFileToServer(String sourcePath, String destinationPath) {
		JSch jsch = new JSch();
		Session session = null;
		try {
			session = jsch.getSession("admin", "127.0.0.1", 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword("pass");
			session.connect();

			Channel channel = session.openChannel("sftp");
			channel.connect();
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			sftpChannel.put("/tmplocal/testUpload.txt", "/tmpremote/testUpload.txt");
			sftpChannel.exit();
			session.disconnect();

		} catch (JSchException e) {
			e.printStackTrace();
		} catch (SftpException e) {
			e.printStackTrace();
		}
		return true;

	}

	public boolean readFileFromServer(String sourcePath, String destinationPath) {
		JSch jsch = new JSch();
		Session session = null;
		try {
			session = jsch.getSession("admin", "127.0.0.1", 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword("pass");
			session.connect();

			Channel channel = session.openChannel("sftp");
			channel.connect();
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			sftpChannel.get("/tmpremote/testDownload.txt", "/tmplocal/testDownload.txt");
			sftpChannel.exit();
			session.disconnect();
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (SftpException e) {
			e.printStackTrace();
		}

		return true;

	}

}
