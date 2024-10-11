import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_checkout(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(type='path'), repo=dict(type='str', required=True, aliases=['name', 'repository']), revision=dict(type='str', default='HEAD', aliases=['rev', 'version']), force=dict(type='bool', default=False), username=dict(type='str'), password=dict(type='str', no_log=True), executable=dict(type='path'), export=dict(type='bool', default=False), checkout=dict(type='bool', default=True), update=dict(type='bool', default=True), switch=dict(type='bool', default=True), in_place=dict(type='bool', default=False), validate_certs=dict(type='bool', default=False)), supports_check_mode=True)
        dest = '/path/to/checkout'
        repo = 'svn+ssh://an.example.org/path/to/repo'
        revision = '1234'
        username = 'user'
        password = 'pass'
        svn_path = '/path/to/svn'
        validate_certs = True
        svn = Subversion(module, dest, repo, revision, username, password, svn_path, validate_certs)
        svn.checkout()
        self.assertEqual(svn.dest, dest)
        self.assertEqual(svn.repo, repo)
        self.assertEqual(svn.revision, revision)
        self.assertEqual(svn.username, username)
        self.assertEqual(svn.password, password)
        self.assertEqual(svn.svn_path, svn_path)
        self.assertEqual(svn.validate_certs, validate_certs)

    def test_export(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(type='path'), repo=dict(type='str', required=True, aliases=['name', 'repository']), revision=dict(type='str', default='HEAD', aliases=['rev', 'version']), force=dict(type='bool', default=False), username=dict(type='str'), password=dict(type='str', no_log=True), executable=dict(type='path'), export=dict(type='bool', default=False), checkout=dict(type='bool', default=True), update=dict(type='bool', default=True), switch=dict(type='bool', default=True), in_place=dict(type='bool', default=False), validate_certs=dict(type='bool', default=False)), supports_check_mode=True)
        dest = '/path/to/export'
        repo = 'svn+ssh://an.example.org/path/to/repo'
        revision = '1234'
        username = 'user'
        password = 'pass'
        svn_path = '/path/to/svn'
        validate_certs = True
        svn = Subversion(module, dest, repo, revision, username, password, svn_path, validate_certs)
        svn.export()
        self.assertEqual(svn.dest, dest)
        self.assertEqual(svn.repo, repo)
        self.assertEqual(svn.revision, revision)
        self.assertEqual(svn.username, username)
        self.assertEqual(svn.password, password)
        self.assertEqual(svn.svn_path, svn_path)
        self.assertEqual(svn.validate_certs, validate_certs)

if __name__ == '__main__':
    unittest.main()