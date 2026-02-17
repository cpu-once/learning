Objective: I believe that LLMs, "Vibe Coding," and AI agent-despite being buzzwords-do not fundamentally alter a programmer's core responsibility; rather they redefine how we work. Therefore, I am conducting an experimental project titled "Programming with Agents and LLMs" to validate this perspective and explore our evolving workflow.

This is a lecture-based project. 
First, I explore the most effective ways to prompt and define the architecture or codebase. this does not aim for a "world-best" architecture or perfect prompting; rather, it focuses on an iterative and incremental SDLC(Software Developing Life Cycle) to facilitate communication with teammates and collaborators.

Second, this project follows a "Learning Log" format. By cloning the repository and following the steps, you will understand how to manage the workflow and identify which additional subjects you need to study—something I am also actively working on myself. More in-depth topics will be covered in separate posts.


# IN PROGRESS
##  Proposed Structure: Programming with Agents & LLMs

### 1. Phase One: The "Architectural Prompt"

Before touching an agent, the human must define the boundaries. This section of your project could focus on:
- Prerequisites : 
	- Learning mermaid and studying [[Mermaid for JavaDev]] 
	- Stanford CS146S [[What_I_Learned/LLM이 코딩을 한다는데요?/00 - Standford CS146S - The Modern Software Developer/Web-sites and Youtube]]

- Constraints vs Autonomy
	- Constraints
		- - **RAG for Codebases:** Instead of pasting entire files, use tools like `repomix` or `gpt-repository-loader` to create a condensed map of the project.

		- **Context Injection:** How to provide the LLM with enough "domain vibe" without hitting token limits.
    
		- **The Blueprint Pattern:** Using Markdown or Mermaid diagrams to define the schema before generating a single `.py` or `.js` file.
- Autonomy
	- **Iterative Refinement:** Starting with a "Steel Thread" (the simplest possible version of the app that works) and adding complexity incrementally.

- How we work?
    
    
---
Here are gemini's output
### ### 2. Phase Two: The Agentic Workflow

This is where you explore the hand-off between the human and the AI Agent.

- **The "Reviewer" Role:** Treating the LLM’s output as a PR (Pull Request) from a junior developer.
    
- **Verification Loops:** Setting up automated test suites that the Agent must pass before the "Vibe" is considered "Code."
    
- **Debugging the "Black Box":** What happens when the Agent enters a logic loop, and how to redirect it.
    

### ### 3. Phase Three: The Learning Log (Metadata)

Your project’s README or log files could track the following for each iteration: | Iteration | Goal | Prompt Strategy | Human Intervention % | Lessons Learned | | :--- | :--- | :--- | :--- | :--- | | 01 | Basic API Setup | System Role + OpenAPI Spec | 20% (Logic fix) | LLM struggled with auth middleware. | | 02 | DB Integration | Reference existing files | 10% (Schema tweak) | Context window management is key. |

---

### ### The Core Philosophy

You are effectively teaching **Systems Thinking**. Even if an LLM writes the function, the human must understand:

1. **Why** that function exists.
    
2. **How** it fails.
    
3. **Where** it fits in the larger lifecycle.
    

> **Note:** "Vibe Coding" works until the "vibe" hits a breaking change in an API or a race condition. That is where the "Programmer's Core Responsibility" you mentioned becomes the most visible.