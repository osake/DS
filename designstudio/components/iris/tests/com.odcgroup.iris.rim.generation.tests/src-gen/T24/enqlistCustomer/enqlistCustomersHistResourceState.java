package T24.enqlistCustomer;
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

public class enqlistCustomersHistResourceState extends CollectionResourceState implements LazyResourceLoader {
    
    private ResourceFactory factory = null;

    public enqlistCustomersHistResourceState() {
        this(new ResourceFactory());
    }

    public enqlistCustomersHistResourceState(ResourceFactory factory) {
        super("enqlistCustomer", "enqlistCustomersHist", createActions(), "/{companyid}/enqlistCustomersHist()", createLinkRelations(), null, null);
        this.factory = factory;
    }
    
    public boolean initialise() {
        Map<String, String> uriLinkageProperties = new HashMap<String, String>();
        List<Expression> conditionalLinkExpressions = null;
        CollectionResourceState senqlistCustomersHist = this;
        // create transitions
        ResourceState senqlistCustomerHist = factory.getResourceState("T24.enqlistCustomer.enqlistCustomerHist");

        // create foreach transition
            conditionalLinkExpressions = null;
            uriLinkageProperties.clear();
        uriLinkageProperties.put("id", "{PrimaryKey}");
            senqlistCustomersHist.addTransition(new Transition.Builder()
                    .flags(Transition.FOR_EACH)
                    .method("GET")
                    .target(senqlistCustomerHist)
                    .uriParameters(uriLinkageProperties)
                    .evaluation(conditionalLinkExpressions != null ? new SimpleLogicalExpressionEvaluator(conditionalLinkExpressions) : null)
                    .label("enqlistCustomerHist")
                    .linkId("")
                    .build());



        return true;
    }
    
    private static List<Action> createActions() {
        Properties actionViewProperties = null;
        List<Action> enqlistCustomersHistActions = new ArrayList<Action>();
        actionViewProperties = new Properties();
        actionViewProperties.put("filter", "{filter}");
        enqlistCustomersHistActions.add(new Action("GetHauthEntities", Action.TYPE.VIEW, actionViewProperties));
        return enqlistCustomersHistActions;
    }

    private static String[] createLinkRelations() {
        String[] enqlistCustomersHistRelations = null;
        return enqlistCustomersHistRelations;
    }
    
}
