package org.jespanol.conference.conference;

import jakarta.nosql.mapping.AttributeConverter;
import org.bson.types.ObjectId;

public class ObjectIdConverter implements AttributeConverter<String, ObjectId> {

    @Override
    public ObjectId convertToDatabaseColumn(String attribute) {
        if(attribute != null) {
            return new ObjectId(attribute);
        }
        return null;
    }

    @Override
    public String convertToEntityAttribute(ObjectId dbData) {
        if(dbData != null) {
            return dbData.toHexString();
        }
        return null;
    }
}
