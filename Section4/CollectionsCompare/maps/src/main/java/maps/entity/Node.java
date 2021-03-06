package maps.entity;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import java.util.Set;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class Node implements Bean {

    /**
     * The node latitude (y)
     */
    @PropertyDefinition(validate = "notNull")
    private Double latitude;

    /**
     * The node longitude (x)
     */
    @PropertyDefinition(validate = "notNull")
    private Double longitude;

    /**
     * The node name
     */
    @PropertyDefinition(validate = "notEmpty")
    private String name;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code Node}.
     * @return the meta-bean, not null
     */
    public static Node.Meta meta() {
        return Node.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(Node.Meta.INSTANCE);
    }

    @Override
    public Node.Meta metaBean() {
        return Node.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the node latitude (y)
     * @return the value of the property, not null
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the node latitude (y)
     * @param latitude  the new value of the property, not null
     */
    public void setLatitude(Double latitude) {
        JodaBeanUtils.notNull(latitude, "latitude");
        this.latitude = latitude;
    }

    /**
     * Gets the the {@code latitude} property.
     * @return the property, not null
     */
    public final Property<Double> latitude() {
        return metaBean().latitude().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the node longitude (x)
     * @return the value of the property, not null
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the node longitude (x)
     * @param longitude  the new value of the property, not null
     */
    public void setLongitude(Double longitude) {
        JodaBeanUtils.notNull(longitude, "longitude");
        this.longitude = longitude;
    }

    /**
     * Gets the the {@code longitude} property.
     * @return the property, not null
     */
    public final Property<Double> longitude() {
        return metaBean().longitude().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the node name
     * @return the value of the property, not empty
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the node name
     * @param name  the new value of the property, not empty
     */
    public void setName(String name) {
        JodaBeanUtils.notEmpty(name, "name");
        this.name = name;
    }

    /**
     * Gets the the {@code name} property.
     * @return the property, not null
     */
    public final Property<String> name() {
        return metaBean().name().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public Node clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("Node{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("latitude").append('=').append(JodaBeanUtils.toString(getLatitude())).append(',').append(' ');
        buf.append("longitude").append('=').append(JodaBeanUtils.toString(getLongitude())).append(',').append(' ');
        buf.append("name").append('=').append(JodaBeanUtils.toString(getName())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Node}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code latitude} property.
         */
        private final MetaProperty<Double> latitude = DirectMetaProperty.ofReadWrite(
                this, "latitude", Node.class, Double.class);
        /**
         * The meta-property for the {@code longitude} property.
         */
        private final MetaProperty<Double> longitude = DirectMetaProperty.ofReadWrite(
                this, "longitude", Node.class, Double.class);
        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
                this, "name", Node.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "latitude",
                "longitude",
                "name");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1439978388:  // latitude
                    return latitude;
                case 137365935:  // longitude
                    return longitude;
                case 3373707:  // name
                    return name;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends Node> builder() {
            return new DirectBeanBuilder<Node>(new Node());
        }

        @Override
        public Class<? extends Node> beanType() {
            return Node.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code latitude} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> latitude() {
            return latitude;
        }

        /**
         * The meta-property for the {@code longitude} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> longitude() {
            return longitude;
        }

        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> name() {
            return name;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1439978388:  // latitude
                    return ((Node) bean).getLatitude();
                case 137365935:  // longitude
                    return ((Node) bean).getLongitude();
                case 3373707:  // name
                    return ((Node) bean).getName();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1439978388:  // latitude
                    ((Node) bean).setLatitude((Double) newValue);
                    return;
                case 137365935:  // longitude
                    ((Node) bean).setLongitude((Double) newValue);
                    return;
                case 3373707:  // name
                    ((Node) bean).setName((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((Node) bean).latitude, "latitude");
            JodaBeanUtils.notNull(((Node) bean).longitude, "longitude");
            JodaBeanUtils.notEmpty(((Node) bean).name, "name");
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
