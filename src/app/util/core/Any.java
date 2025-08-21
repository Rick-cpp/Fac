package app.util.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Any {
    public static String TYPE_MAP       = "@Map";
    public static String TYPE_NULL      = "@Null";
    public static String TYPE_LIST      = "@List";
    public static String TYPE_TUPLE     = "@Tuple";
    public static String TYPE_OBJECT    = "@Object";
    public static String TYPE_STRING    = "@String";
    public static String TYPE_PRIMITIVE = "@Primitive";

    public static String type(Object any) {
        if (any == null) return TYPE_NULL;
        if (any instanceof String) return TYPE_STRING;
        if (any instanceof Number || any instanceof Boolean || any instanceof Character) return TYPE_PRIMITIVE;
        if (any.getClass().isArray()) return TYPE_TUPLE;
        if (any instanceof Collection) return TYPE_LIST;
        if (any instanceof Map) return TYPE_MAP;
        
        return TYPE_NULL;
    }

    public static String tupleToString(Object[] tuple) {
        StringBuilder builder = new StringBuilder();
        int length = tuple.length;

        builder.append("(");

        for (int i = 0; i < length; i++) {
            builder.append(toStringSafe(tuple[i]));
            if (i != length - 1) builder.append(", ");
        }

        builder.append(")");

        return builder.toString();
    }
    
    public static String listToString(Collection<?> collection) {
        StringBuilder builder = new StringBuilder();
        Object[] arr = collection.toArray();
        int length = arr.length;

        builder.append("[");

        for (int i = 0; i < length; i++) {
            builder.append(toStringSafe(arr[i]));
            if (i != length - 1) builder.append(", ");
        }

        builder.append("]");
        return builder.toString();
    }

    public static String mapToString(Map<?, ?> map) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");

        for (Iterator<? extends Map.Entry<?, ?>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<?, ?> entry = it.next();
            builder.append(toStringSafe(entry.getKey()));
            builder.append(": ");
            builder.append(toStringSafe(entry.getValue()));
            if (it.hasNext()) builder.append(", ");
        }

        builder.append("}");
        return builder.toString();
    }


    @SuppressWarnings("unchecked")
    public static String toStringSafe(Object obj) {
        String type = type(obj);
        
        if (type == TYPE_NULL) return "@Null";
        if (type == TYPE_TUPLE) return tupleToString((Object[]) obj);
        if (type == TYPE_LIST) return listToString((List<Object>) obj);
        if (type == TYPE_MAP) return mapToString((Map<Object, Object>) obj);
        return obj.toString();
    }

    public static String toStringSafeArgs(String step, String end, Object[] objects) {
        StringBuilder builder = new StringBuilder();
        
        for (var obj : objects) {
            builder.append(toStringSafe(obj));
            builder.append(step);
        }

        builder.append(end);

        return builder.toString();
    }
}
