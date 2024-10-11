# Automatically generated by Pynguin.
import ansible.modules.dnf as module_0

def test_case_0():
    try:
        str_0 = '\n    author: Ansible Core Team\n    name: winrm\n    short_description: Run tasks over Microsoft\'s WinRM\n    description:\n        - Run commands or put/fetch on a target via WinRM\n        - This plugin allows extra arguments to be passed that are supported by the protocol but not explicitly defined here.\n          They should take the form of variables declared with the following pattern `ansible_winrm_<option>`.\n    version_added: "2.0"\n    extends_documentation_fragment:\n        - connection_pipelining\n    requirements:\n        - pywinrm (python library)\n    options:\n      # figure out more elegant \'delegation\'\n      remote_addr:\n        description:\n            - Address of the windows machine\n        default: inventory_hostname\n        vars:\n            - name: ansible_host\n            - name: ansible_winrm_host\n        type: str\n      remote_user:\n        description:\n            - The user to log in as to the Windows machine\n        vars:\n            - name: ansible_user\n            - name: ansible_winrm_user\n        type: str\n      remote_password:\n        description: Authentication password for the C(remote_user). Can be supplied as CLI option.\n        vars:\n            - name: ansible_password\n            - name: ansible_winrm_pass\n            - name: ansible_winrm_password\n        type: str\n        aliases:\n        - password  # Needed for --ask-pass to come through on delegation\n      port:\n        description:\n            - port for winrm to connect on remote target\n            - The default is the https (5986) port, if using http it should be 5985\n        vars:\n          - name: ansible_port\n          - name: ansible_winrm_port\n        default: 5986\n        type: integer\n      scheme:\n        description:\n            - URI scheme to use\n            - If not set, then will default to C(https) or C(http) if I(port) is\n              C(5985).\n        choices: [http, https]\n        vars:\n          - name: ansible_winrm_scheme\n        type: str\n      path:\n        description: URI path to connect to\n        default: \'/wsman\'\n        vars:\n          - name: ansible_winrm_path\n        type: str\n      transport:\n        description:\n           - List of winrm transports to attempt to use (ssl, plaintext, kerberos, etc)\n           - If None (the default) the plugin will try to automatically guess the correct list\n           - The choices available depend on your version of pywinrm\n        type: list\n        vars:\n          - name: ansible_winrm_transport\n      kerberos_command:\n        description: kerberos command to use to request a authentication ticket\n        default: kinit\n        vars:\n          - name: ansible_winrm_kinit_cmd\n        type: str\n      kinit_args:\n        description:\n        - Extra arguments to pass to C(kinit) when getting the Kerberos authentication ticket.\n        - By default no extra arguments are passed into C(kinit) unless I(ansible_winrm_kerberos_delegation) is also\n          set. In that case C(-f) is added to the C(kinit) args so a forwardable ticket is retrieved.\n        - If set, the args will overwrite any existing defaults for C(kinit), including C(-f) for a delegated ticket.\n        type: str\n        vars:\n          - name: ansible_winrm_kinit_args\n        version_added: \'2.11\'\n      kinit_env_vars:\n        description:\n        - A list of environment variables to pass through to C(kinit) when getting the Kerberos authentication ticket.\n        - By default no environment variables are passed through and C(kinit) is run with a blank slate.\n        - The environment variable C(KRB5CCNAME) cannot be specified here as it\'s used to store the temp Kerberos\n          ticket used by WinRM.\n        type: list\n        elements: str\n        default: []\n        ini:\n        - section: winrm\n          key: kinit_env_vars\n        vars:\n          - name: ansible_winrm_kinit_env_vars\n        version_added: \'2.12\'\n      kerberos_mode:\n        description:\n            - kerberos usage mode.\n            - The managed option means Ansible will obtain kerberos ticket.\n            - While the manual one means a ticket must already have been obtained by the user.\n            - If having issues with Ansible freezing when trying to obtain the\n              Kerberos ticket, you can either set this to C(manual) and obtain\n              it outside Ansible or install C(pexpect) through pip and try\n              again.\n        choices: [managed, manual]\n        vars:\n          - name: ansible_winrm_kinit_mode\n        type: str\n      connection_timeout:\n        description:\n            - Sets the operation and read timeout settings for the WinRM\n              connection.\n            - Corresponds to the C(operation_timeout_sec) and\n              C(read_timeout_sec) args in pywinrm so avoid setting these vars\n              with this one.\n            - The default value is whatever is set in the installed version of\n              pywinrm.\n        vars:\n          - name: ansible_winrm_connection_timeout\n        type: int\n'
        dnf_module_0 = module_0.DnfModule(str_0)
    except BaseException:
        pass