package T24.enqlistAlternateAccount;
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

public class enqlistAlternateAccountsResourceState extends CollectionResourceState implements LazyResourceLoader {
    
    private ResourceFactory factory = null;

    public enqlistAlternateAccountsResourceState() {
        this(new ResourceFactory());
    }

    public enqlistAlternateAccountsResourceState(ResourceFactory factory) {
        super("enqlistAlternateAccount", "enqlistAlternateAccounts", createActions(), "/{companyid}/enqlistAlternateAccounts()", createLinkRelations(), null, null);
        this.factory = factory;
    }
    
    public boolean initialise() {
        Map<String, String> uriLinkageProperties = new HashMap<String, String>();
        List<Expression> conditionalLinkExpressions = null;
        CollectionResourceState senqlistAlternateAccounts = this;
        // create transitions
        ResourceState senqlistAlternateAccount = factory.getResourceState("T24.enqlistAlternateAccount.enqlistAlternateAccount");

        // create foreach transition
            conditionalLinkExpressions = null;
            uriLinkageProperties.clear();
        uriLinkageProperties.put("id", "{PrimaryKey}");
            senqlistAlternateAccounts.addTransition(new Transition.Builder()
                    .flags(Transition.FOR_EACH)
                    .method("GET")
                    .target(senqlistAlternateAccount)
                    .uriParameters(uriLinkageProperties)
                    .evaluation(conditionalLinkExpressions != null ? new SimpleLogicalExpressionEvaluator(conditionalLinkExpressions) : null)
                    .label("enqlistAlternateAccount")
                    .linkId("")
                    .build());



        return true;
    }
    
    private static List<Action> createActions() {
        Properties actionViewProperties = null;
        List<Action> enqlistAlternateAccountsActions = new ArrayList<Action>();
        actionViewProperties = new Properties();
        actionViewProperties.put("filter", "{filter}");
        enqlistAlternateAccountsActions.add(new Action("GETEntities", Action.TYPE.VIEW, actionViewProperties));
        return enqlistAlternateAccountsActions;
    }

    private static String[] createLinkRelations() {
        String[] enqlistAlternateAccountsRelations = null;
        return enqlistAlternateAccountsRelations;
    }
    
}
