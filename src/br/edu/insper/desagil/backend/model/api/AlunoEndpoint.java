package br.edu.insper.desagil.backend.model.api;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.edu.insper.desagil.backend.core.Endpoint;
import br.edu.insper.desagil.backend.model.Aluno;
import br.edu.insper.desagil.backend.model.db.AlunoDAO;

public class AlunoEndpoint extends Endpoint<Aluno> {
	public AlunoEndpoint() {
		super("/aluno");
	}

	@Override
	public Aluno get(Map<String, String> args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		String key = require(args, "matricula");
		return dao.retrieve(key);
	}

	@Override
	public Map<String, String> post(Map<String, String> args, Aluno aluno) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		Date date = dao.create(aluno);
		Map<String, String> body = new HashMap<>();
		body.put("date", date.toString());
		return body;
	}

	@Override
	public Map<String, String> put(Map<String, String> args, Aluno aluno) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		Date date = dao.update(aluno);
		Map<String, String> body = new HashMap<>();
		body.put("date", date.toString());
		return body;
	}

	@Override
	public Map<String, String> delete(Map<String, String> args) throws Exception {
		AlunoDAO dao = new AlunoDAO();
		String key = require(args, "matricula");
		Date date = dao.delete(key);
		Map<String, String> body = new HashMap<>();
		body.put("date", date.toString());
		return body;
	}
}