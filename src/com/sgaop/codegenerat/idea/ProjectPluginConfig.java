package com.sgaop.codegenerat.idea;

import com.intellij.openapi.application.Application;
import com.intellij.openapi.command.CommandProcessor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.sgaop.codegenerat.vo.JavaFieldVO;

import java.util.List;

/**
 * @author 黄川 306955302@qq.com
 * @date: 2018/5/30
 */
public class ProjectPluginConfig {

    Application applicationManager;

    CommandProcessor processor;
    /**
     * 当前所在文档
     **/
    Document document;

    Project project;

    Editor editor;

    PsiFile psiFile;

    List<JavaFieldVO> javaFields;

    public ProjectPluginConfig(Application applicationManager, CommandProcessor processor, Document document, Project project, Editor editor, PsiFile psiFile, List<JavaFieldVO> javaFields) {
        this.applicationManager = applicationManager;
        this.processor = processor;
        this.document = document;
        this.project = project;
        this.editor = editor;
        this.psiFile = psiFile;
        this.javaFields = javaFields;
    }

    public List<JavaFieldVO> getJavaFields() {
        return javaFields;
    }

    public void setJavaFields(List<JavaFieldVO> javaFields) {
        this.javaFields = javaFields;
    }

    public PsiFile getPsiFile() {
        return psiFile;
    }

    public void setPsiFile(PsiFile psiFile) {
        this.psiFile = psiFile;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Application getApplicationManager() {
        return applicationManager;
    }

    public void setApplicationManager(Application applicationManager) {
        this.applicationManager = applicationManager;
    }

    public CommandProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(CommandProcessor processor) {
        this.processor = processor;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
