package DP.ChainOfResponsibility;

public class ConcreteHandlerThree extends Handler
{
	public void handleRequest(Request request)
	{
		if (request.getValue() >= 0)
		{           //if request is eligible handle it
			System.out.println("Zero values are handled by ConcreteHandlerThree:");
			System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}
        else
		{
        	if(this.m_successor!=null){
				this.m_successor.handleRequest(request);
			}
		}
	}
}
