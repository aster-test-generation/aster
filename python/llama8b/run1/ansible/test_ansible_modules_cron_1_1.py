import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes, to_native
from ansible.module_utils.six.moves import shlex_quote
from ansible.modules import


class TestCron(unittest.TestCase):
    def test_cron_init(self):
        module = AnsibleModule()
        self.assertEqual(module.__init__(), None)

    def test_cron_name(self):
        module = AnsibleModule()
        result = module._ansible_module_name
        self.assertEqual(result, 'cron')

    def test_cron_documentation(self):
        result = DOCUMENTATION
        self.assertEqual(result, '\n---\nmodule: cron\nshort_description: Manage cron.d and crontab entries\ndescription:\n  - Use this module to manage crontab and environment variables entries. This module allows\n    you to create environment variables and named crontab entries, update, or delete them.\n  - \'When crontab jobs are managed: the module includes one line with the description of the\n    crontab entry C("')

    def test_cron_examples(self):
        result = EXAMPLES
        self.assertEqual(result, '\n- name: Ensure a job that runs at 2 and 5 exists. Creates an entry like "0 5,2 * * ls -alh > /dev/null"\n  ansible.builtin.cron:\n    name: "check dirs"\n    minute: "0"\n    hour: "5,2"\n    job: "ls -alh > /dev/null"\n\n- name: \'Ensure an old job is no longer present. Removes any job that is prefixed by ')

    def test_cron_return(self):
        result = RETURN
        self.assertEqual(result, '')


if __name__ == '__main__':
    unittest.main()