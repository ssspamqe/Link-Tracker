/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    private String triggerCatalog;
    private String triggerSchema;
    private String triggerName;
    private String eventManipulation;
    private String eventObjectCatalog;
    private String eventObjectSchema;
    private String eventObjectTable;
    private Integer actionOrder;
    private String actionCondition;
    private String actionStatement;
    private String actionOrientation;
    private String actionTiming;
    private String actionReferenceOldTable;
    private String actionReferenceNewTable;
    private String actionReferenceOldRow;
    private String actionReferenceNewRow;
    private OffsetDateTime created;

    public Triggers() {}

    public Triggers(Triggers value) {
        this.triggerCatalog = value.triggerCatalog;
        this.triggerSchema = value.triggerSchema;
        this.triggerName = value.triggerName;
        this.eventManipulation = value.eventManipulation;
        this.eventObjectCatalog = value.eventObjectCatalog;
        this.eventObjectSchema = value.eventObjectSchema;
        this.eventObjectTable = value.eventObjectTable;
        this.actionOrder = value.actionOrder;
        this.actionCondition = value.actionCondition;
        this.actionStatement = value.actionStatement;
        this.actionOrientation = value.actionOrientation;
        this.actionTiming = value.actionTiming;
        this.actionReferenceOldTable = value.actionReferenceOldTable;
        this.actionReferenceNewTable = value.actionReferenceNewTable;
        this.actionReferenceOldRow = value.actionReferenceOldRow;
        this.actionReferenceNewRow = value.actionReferenceNewRow;
        this.created = value.created;
    }

    @ConstructorProperties({ "triggerCatalog", "triggerSchema", "triggerName", "eventManipulation", "eventObjectCatalog", "eventObjectSchema", "eventObjectTable", "actionOrder", "actionCondition", "actionStatement", "actionOrientation", "actionTiming", "actionReferenceOldTable", "actionReferenceNewTable", "actionReferenceOldRow", "actionReferenceNewRow", "created" })
    public Triggers(
        @Nullable String triggerCatalog,
        @Nullable String triggerSchema,
        @Nullable String triggerName,
        @Nullable String eventManipulation,
        @Nullable String eventObjectCatalog,
        @Nullable String eventObjectSchema,
        @Nullable String eventObjectTable,
        @Nullable Integer actionOrder,
        @Nullable String actionCondition,
        @Nullable String actionStatement,
        @Nullable String actionOrientation,
        @Nullable String actionTiming,
        @Nullable String actionReferenceOldTable,
        @Nullable String actionReferenceNewTable,
        @Nullable String actionReferenceOldRow,
        @Nullable String actionReferenceNewRow,
        @Nullable OffsetDateTime created
    ) {
        this.triggerCatalog = triggerCatalog;
        this.triggerSchema = triggerSchema;
        this.triggerName = triggerName;
        this.eventManipulation = eventManipulation;
        this.eventObjectCatalog = eventObjectCatalog;
        this.eventObjectSchema = eventObjectSchema;
        this.eventObjectTable = eventObjectTable;
        this.actionOrder = actionOrder;
        this.actionCondition = actionCondition;
        this.actionStatement = actionStatement;
        this.actionOrientation = actionOrientation;
        this.actionTiming = actionTiming;
        this.actionReferenceOldTable = actionReferenceOldTable;
        this.actionReferenceNewTable = actionReferenceNewTable;
        this.actionReferenceOldRow = actionReferenceOldRow;
        this.actionReferenceNewRow = actionReferenceNewRow;
        this.created = created;
    }

    @Nullable
    public String getTriggerCatalog() {
        return this.triggerCatalog;
    }

    public void setTriggerCatalog(@Nullable String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    @Nullable
    public String getTriggerSchema() {
        return this.triggerSchema;
    }

    public void setTriggerSchema(@Nullable String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    @Nullable
    public String getTriggerName() {
        return this.triggerName;
    }

    public void setTriggerName(@Nullable String triggerName) {
        this.triggerName = triggerName;
    }

    @Nullable
    public String getEventManipulation() {
        return this.eventManipulation;
    }

    public void setEventManipulation(@Nullable String eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    @Nullable
    public String getEventObjectCatalog() {
        return this.eventObjectCatalog;
    }

    public void setEventObjectCatalog(@Nullable String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    @Nullable
    public String getEventObjectSchema() {
        return this.eventObjectSchema;
    }

    public void setEventObjectSchema(@Nullable String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    @Nullable
    public String getEventObjectTable() {
        return this.eventObjectTable;
    }

    public void setEventObjectTable(@Nullable String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    @Nullable
    public Integer getActionOrder() {
        return this.actionOrder;
    }

    public void setActionOrder(@Nullable Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    @Nullable
    public String getActionCondition() {
        return this.actionCondition;
    }

    public void setActionCondition(@Nullable String actionCondition) {
        this.actionCondition = actionCondition;
    }

    @Nullable
    public String getActionStatement() {
        return this.actionStatement;
    }

    public void setActionStatement(@Nullable String actionStatement) {
        this.actionStatement = actionStatement;
    }

    @Nullable
    public String getActionOrientation() {
        return this.actionOrientation;
    }

    public void setActionOrientation(@Nullable String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    @Nullable
    public String getActionTiming() {
        return this.actionTiming;
    }

    public void setActionTiming(@Nullable String actionTiming) {
        this.actionTiming = actionTiming;
    }

    @Nullable
    public String getActionReferenceOldTable() {
        return this.actionReferenceOldTable;
    }

    public void setActionReferenceOldTable(@Nullable String actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    @Nullable
    public String getActionReferenceNewTable() {
        return this.actionReferenceNewTable;
    }

    public void setActionReferenceNewTable(@Nullable String actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    @Nullable
    public String getActionReferenceOldRow() {
        return this.actionReferenceOldRow;
    }

    public void setActionReferenceOldRow(@Nullable String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    @Nullable
    public String getActionReferenceNewRow() {
        return this.actionReferenceNewRow;
    }

    public void setActionReferenceNewRow(@Nullable String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
    }

    @Nullable
    public OffsetDateTime getCreated() {
        return this.created;
    }

    public void setCreated(@Nullable OffsetDateTime created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Triggers other = (Triggers) obj;
        if (this.triggerCatalog == null) {
            if (other.triggerCatalog != null)
                return false;
        }
        else if (!this.triggerCatalog.equals(other.triggerCatalog))
            return false;
        if (this.triggerSchema == null) {
            if (other.triggerSchema != null)
                return false;
        }
        else if (!this.triggerSchema.equals(other.triggerSchema))
            return false;
        if (this.triggerName == null) {
            if (other.triggerName != null)
                return false;
        }
        else if (!this.triggerName.equals(other.triggerName))
            return false;
        if (this.eventManipulation == null) {
            if (other.eventManipulation != null)
                return false;
        }
        else if (!this.eventManipulation.equals(other.eventManipulation))
            return false;
        if (this.eventObjectCatalog == null) {
            if (other.eventObjectCatalog != null)
                return false;
        }
        else if (!this.eventObjectCatalog.equals(other.eventObjectCatalog))
            return false;
        if (this.eventObjectSchema == null) {
            if (other.eventObjectSchema != null)
                return false;
        }
        else if (!this.eventObjectSchema.equals(other.eventObjectSchema))
            return false;
        if (this.eventObjectTable == null) {
            if (other.eventObjectTable != null)
                return false;
        }
        else if (!this.eventObjectTable.equals(other.eventObjectTable))
            return false;
        if (this.actionOrder == null) {
            if (other.actionOrder != null)
                return false;
        }
        else if (!this.actionOrder.equals(other.actionOrder))
            return false;
        if (this.actionCondition == null) {
            if (other.actionCondition != null)
                return false;
        }
        else if (!this.actionCondition.equals(other.actionCondition))
            return false;
        if (this.actionStatement == null) {
            if (other.actionStatement != null)
                return false;
        }
        else if (!this.actionStatement.equals(other.actionStatement))
            return false;
        if (this.actionOrientation == null) {
            if (other.actionOrientation != null)
                return false;
        }
        else if (!this.actionOrientation.equals(other.actionOrientation))
            return false;
        if (this.actionTiming == null) {
            if (other.actionTiming != null)
                return false;
        }
        else if (!this.actionTiming.equals(other.actionTiming))
            return false;
        if (this.actionReferenceOldTable == null) {
            if (other.actionReferenceOldTable != null)
                return false;
        }
        else if (!this.actionReferenceOldTable.equals(other.actionReferenceOldTable))
            return false;
        if (this.actionReferenceNewTable == null) {
            if (other.actionReferenceNewTable != null)
                return false;
        }
        else if (!this.actionReferenceNewTable.equals(other.actionReferenceNewTable))
            return false;
        if (this.actionReferenceOldRow == null) {
            if (other.actionReferenceOldRow != null)
                return false;
        }
        else if (!this.actionReferenceOldRow.equals(other.actionReferenceOldRow))
            return false;
        if (this.actionReferenceNewRow == null) {
            if (other.actionReferenceNewRow != null)
                return false;
        }
        else if (!this.actionReferenceNewRow.equals(other.actionReferenceNewRow))
            return false;
        if (this.created == null) {
            if (other.created != null)
                return false;
        }
        else if (!this.created.equals(other.created))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.triggerCatalog == null) ? 0 : this.triggerCatalog.hashCode());
        result = prime * result + ((this.triggerSchema == null) ? 0 : this.triggerSchema.hashCode());
        result = prime * result + ((this.triggerName == null) ? 0 : this.triggerName.hashCode());
        result = prime * result + ((this.eventManipulation == null) ? 0 : this.eventManipulation.hashCode());
        result = prime * result + ((this.eventObjectCatalog == null) ? 0 : this.eventObjectCatalog.hashCode());
        result = prime * result + ((this.eventObjectSchema == null) ? 0 : this.eventObjectSchema.hashCode());
        result = prime * result + ((this.eventObjectTable == null) ? 0 : this.eventObjectTable.hashCode());
        result = prime * result + ((this.actionOrder == null) ? 0 : this.actionOrder.hashCode());
        result = prime * result + ((this.actionCondition == null) ? 0 : this.actionCondition.hashCode());
        result = prime * result + ((this.actionStatement == null) ? 0 : this.actionStatement.hashCode());
        result = prime * result + ((this.actionOrientation == null) ? 0 : this.actionOrientation.hashCode());
        result = prime * result + ((this.actionTiming == null) ? 0 : this.actionTiming.hashCode());
        result = prime * result + ((this.actionReferenceOldTable == null) ? 0 : this.actionReferenceOldTable.hashCode());
        result = prime * result + ((this.actionReferenceNewTable == null) ? 0 : this.actionReferenceNewTable.hashCode());
        result = prime * result + ((this.actionReferenceOldRow == null) ? 0 : this.actionReferenceOldRow.hashCode());
        result = prime * result + ((this.actionReferenceNewRow == null) ? 0 : this.actionReferenceNewRow.hashCode());
        result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Triggers (");

        sb.append(triggerCatalog);
        sb.append(", ").append(triggerSchema);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(eventManipulation);
        sb.append(", ").append(eventObjectCatalog);
        sb.append(", ").append(eventObjectSchema);
        sb.append(", ").append(eventObjectTable);
        sb.append(", ").append(actionOrder);
        sb.append(", ").append(actionCondition);
        sb.append(", ").append(actionStatement);
        sb.append(", ").append(actionOrientation);
        sb.append(", ").append(actionTiming);
        sb.append(", ").append(actionReferenceOldTable);
        sb.append(", ").append(actionReferenceNewTable);
        sb.append(", ").append(actionReferenceOldRow);
        sb.append(", ").append(actionReferenceNewRow);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}
