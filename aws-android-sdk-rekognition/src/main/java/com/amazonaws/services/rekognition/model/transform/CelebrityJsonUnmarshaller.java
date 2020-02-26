/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Celebrity
 */
class CelebrityJsonUnmarshaller implements Unmarshaller<Celebrity, JsonUnmarshallerContext> {

    public Celebrity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Celebrity celebrity = new Celebrity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Urls")) {
                celebrity.setUrls(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                celebrity.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                celebrity.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Face")) {
                celebrity.setFace(ComparedFaceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MatchConfidence")) {
                celebrity.setMatchConfidence(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return celebrity;
    }

    private static CelebrityJsonUnmarshaller instance;

    public static CelebrityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CelebrityJsonUnmarshaller();
        return instance;
    }
}
