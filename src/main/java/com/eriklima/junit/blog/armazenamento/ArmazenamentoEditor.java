package com.eriklima.junit.blog.armazenamento;

import com.eriklima.junit.blog.modelo.Editor;

import java.util.List;
import java.util.Optional;
/*
 * Local onde são armazenados os editores
 */
public interface ArmazenamentoEditor {
    Editor salvar(Editor editor);
    Optional<Editor> encontrarPorId(Long editor);
    Optional<Editor> encontrarPorEmail(String email);
    Optional<Editor> encontrarPorEmailComIdDiferenteDe(String email, Long id);
    void remover(Long editorId);
    List<Editor> encontrarTodos();
}
