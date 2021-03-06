package T24.verAcEnrichment_Create;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import com.temenos.interaction.core.hypermedia.UriSpecification;
import com.temenos.interaction.core.hypermedia.Action;
import com.temenos.interaction.core.hypermedia.CollectionResourceState;
import com.temenos.interaction.core.hypermedia.DynamicResourceState;        
import com.temenos.interaction.core.hypermedia.LazyResourceLoader;        
import com.temenos.interaction.core.hypermedia.ResourceFactory;
import com.temenos.interaction.core.hypermedia.ResourceState;
import com.temenos.interaction.core.hypermedia.ResourceStateMachine;
import com.temenos.interaction.core.hypermedia.Transition;
import com.temenos.interaction.core.hypermedia.validation.HypermediaValidator;
import com.temenos.interaction.core.hypermedia.expression.Expression;
import com.temenos.interaction.core.hypermedia.expression.ResourceGETExpression;
import com.temenos.interaction.core.hypermedia.expression.SimpleLogicalExpressionEvaluator;
import com.temenos.interaction.core.hypermedia.ResourceLocator;        
import com.temenos.interaction.core.hypermedia.ResourceLocatorProvider;

public class verAcEnrichment_Creates_enrichmentsResourceState extends CollectionResourceState implements LazyResourceLoader {
    
    private ResourceFactory factory = null;

    public verAcEnrichment_Creates_enrichmentsResourceState() {
        this(new ResourceFactory());
    }

    public verAcEnrichment_Creates_enrichmentsResourceState(ResourceFactory factory) {
        super("Enrichment", "verAcEnrichment_Creates_enrichments", createActions(), "/{companyid}/verAcEnrichment_Creates_enrichments()/enrichments", createLinkRelations(), null, null);
        this.factory = factory;
    }
    
    public boolean initialise() {
        Map<String, String> uriLinkageProperties = new HashMap<String, String>();
        List<Expression> conditionalLinkExpressions = null;
        CollectionResourceState sverAcEnrichment_Creates_enrichments = this;
        // create transitions
        return true;
    }
    
    private static List<Action> createActions() {
        Properties actionViewProperties = null;
        List<Action> verAcEnrichment_Creates_enrichmentsActions = new ArrayList<Action>();
        return verAcEnrichment_Creates_enrichmentsActions;
    }

    private static String[] createLinkRelations() {
        String verAcEnrichment_Creates_enrichmentsRelationsStr = "";
        verAcEnrichment_Creates_enrichmentsRelationsStr += "http://temenostech.temenos.com/rels/enrichments ";
        String[] verAcEnrichment_Creates_enrichmentsRelations = verAcEnrichment_Creates_enrichmentsRelationsStr.trim().split(" ");
        return verAcEnrichment_Creates_enrichmentsRelations;
    }
    
}
