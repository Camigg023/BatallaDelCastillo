package app.adapter.in.validators;

import org.springframework.stereotype.Component;
import app.adapter.in.rest.request.RegisterMessageRequest;
import app.application.exceptions.InvalidDataException;

@Component
public class RegisterMessageValidator {

    public void validate(RegisterMessageRequest request) {

        if (request == null)
            throw new InvalidDataException("La solicitud no puede ser nula");

        if (request.getPillarId() == null)
            throw new InvalidDataException("PillarId es requerido");

        if (request.getFragmentedContent() == null || request.getFragmentedContent().isBlank())
            throw new InvalidDataException("El contenido fragmentado es requerido");

        String content = request.getFragmentedContent().trim();

        if (content.replace(".", "").replace(" ", "").isEmpty())
            throw new InvalidDataException("Contenido fragmentado no valido ");

        if (content.length() < 3)
            throw new InvalidDataException("Contenido fragmentado muy corto");

        if (content.length() > 1000)
            throw new InvalidDataException("Contenido fragmentado muy largo");
    }
}


