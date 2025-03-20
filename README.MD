## WebApplicationContext

Interface to provide configuration for a web application.
This interface adds a getServletContext() method to the generic ApplicationContext interface, and defines a well-known application attribute name that the root context must be bound to in the bootstrap process.
Web application contexts are hierarchical.
WebApplicationContext implementations need to detect ServletContextAware beans and invoke the setServletContext method accordingly.

---
## RequestMapping

**@RequestMapping** annotation to map requests to controllers methods.

There are also HTTP method specific shortcut variants of @RequestMapping:
- **@GetMapping** - Annotation for mapping HTTP GET requests onto specific handler methods.
- **@PostMuping Xd** - Annotation for mapping HTTP POST requests onto specific handler methods.
- **@PutMapping** - Annotation for mapping HTTP PUT requests onto specific handler methods.
- **@DeleteMapping** - Annotation for mapping HTTP Delete requests onto specific handler methods.
- **@PatchMapping** - Annotation for mapping HTTP Patch requests onto specific handler methods.

*Params*:
- Headers - The headers of the mapped request, narrowing the primary mapping.
- Consumes - Narrows the primary mapping by media types that can be consumed by the mapped handler. Consists of one or more media types one of which must match to the request Content-Type header. 
- Name - Assign a name to this mapping.
- Params - The parameters of the mapped request, narrowing the primary mapping.
- Path - The path mapping URIs — for example, "/profile".
- Produces - Narrows the primary mapping by media types that can be produced by the mapped handler. Consists of one or more media types one of which must be chosen via content negotiation against the "acceptable" media types of the request. Typically those are extracted from the "Accept" header but may be derived from query parameters, or other.
- Value - The path mapping URIs — for example, "/profile".