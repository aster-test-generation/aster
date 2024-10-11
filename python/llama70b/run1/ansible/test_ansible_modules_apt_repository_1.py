import unittest
from ansible.modules.apt_repository import *


class TestAptRepositoryModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(required=True), state=dict(default='present')))
        self.assertIsInstance(module, AnsibleModule)

    def test_install_python_apt(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(required=True), state=dict(default='present')))
        install_python_apt(module, 'python-apt')
        self.assertTrue(True)  # no exception raised

    def test_get_add_ppa_signing_key_callback(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(required=True), state=dict(default='present')))
        callback = get_add_ppa_signing_key_callback(module)
        self.assertIsInstance(callback, callable)

    def test_revert_sources_list(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(required=True), state=dict(default='present')))
        sources_before = {'file1': 'content1'}
        sources_after = {'file2': 'content2'}
        sourceslist_before = mock.Mock()
        revert_sources_list(sources_before, sources_after, sourceslist_before)
        self.assertTrue(sourceslist_before.save.called)

    def test___str__(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(required=True), state=dict(default='present')))
        self.assertEqual(str(module), 'AnsibleModule')

    def test___repr__(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(required=True), state=dict(default='present')))
        self.assertEqual(repr(module), 'AnsibleModule({})')

class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test_run_command(self):
        instance = AnsibleModule()
        result = instance.run_command(['echo', 'hello'])
        self.assertEqual(result, (0, b'hello\n', b''))

class TestAptRepository(unittest.TestCase):
    def test_install_python_apt(self):
        module = AnsibleModule()
        install_python_apt(module, 'python-apt')
        # assert that the module has been installed

    def test_get_add_ppa_signing_key_callback(self):
        module = AnsibleModule()
        callback = get_add_ppa_signing_key_callback(module)
        self.assertIsInstance(callback, callable)

    def test_revert_sources_list(self):
        sources_before = {'file1': 'content1'}
        sources_after = {'file2': 'content2'}
        sourceslist_before = {'file1': 'content1'}
        revert_sources_list(sources_before, sources_after, sourceslist_before)
        self.assertFalse(os.path.exists('file2'))

    def test_DEFAULT_SOURCES_PERM(self):
        self.assertEqual(DEFAULT_SOURCES_PERM, 420)

    def test_VALID_SOURCE_TYPES(self):
        self.assertEqual(VALID_SOURCE_TYPES, ('deb', 'deb-src'))

if __name__ == '__main__':
    unittest.main()