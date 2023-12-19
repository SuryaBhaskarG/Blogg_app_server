package com.project.surya.blog.exception;

public class SpringBlogException extends RuntimeException 
{
	
    private static final long serialVersionUID = 1L;

	public SpringBlogException(String message)
    {
        super(message);
    }
}
