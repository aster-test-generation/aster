import unittest
from ansible.modules.expect import *


class TestExpectModule(unittest.TestCase):

    def test_init(self):
        module = AnsibleModule(
            argument_spec=dict(
                command=dict(required=True),
                chdir=dict(type='path'),
                creates=dict(type='path'),
                removes=dict(type='path'),
                responses=dict(type='dict', required=True),
                timeout=dict(type='int', default=30),
                echo=dict(type='bool', default=False),
            )
        )
        self.assertEqual(module.params['command'], None)
        self.assertEqual(module.params['chdir'], None)
        self.assertEqual(module.params['creates'], None)
        self.assertEqual(module.params['removes'], None)
        self.assertEqual(module.params['responses'], None)
        self.assertEqual(module.params['timeout'], 30)
        self.assertEqual(module.params['echo'], False)

    def test_response_closure(self):
        module = AnsibleModule(
            argument_spec=dict(
                command=dict(required=True),
                chdir=dict(type='path'),
                creates=dict(type='path'),
                removes=dict(type='path'),
                responses=dict(type='dict', required=True),
                timeout=dict(type='int', default=30),
                echo=dict(type='bool', default=False),
            )
        )
        question = 'question'
        responses = ['response1', 'response2', 'response3']
        resp_gen = (b'%s\n' % to_bytes(r).rstrip(b'\n') for r in responses)
        def wrapped(info):
            try:
                return next(resp_gen)
            except StopIteration:
                module.fail_json(msg="No remaining responses for '%s', "
                                     "output was '%s'" %
                                     (question,
                                      info['child_result_list'][-1]))
        self.assertEqual(wrapped(None), b'response1\n')

    def test_main(self):
        module = AnsibleModule(
            argument_spec=dict(
                command=dict(required=True),
                chdir=dict(type='path'),
                creates=dict(type='path'),
                removes=dict(type='path'),
                responses=dict(type='dict', required=True),
                timeout=dict(type='int', default=30),
                echo=dict(type='bool', default=False),
            )
        )
        chdir = 'chdir'
        args = 'args'
        creates = 'creates'
        removes = 'removes'
        responses = {'question': 'response'}
        timeout = 30
        echo = False
        events = dict()
        for key, value in responses.items():
            if isinstance(value, list):
                response = response_closure(module, key, value)
            else:
                response = b'%s\n' % to_bytes(value).rstrip(b'\n')
            events[to_bytes(key)] = response
        self.assertEqual(module.params['command'], args)
        self.assertEqual(module.params['chdir'], chdir)
        self.assertEqual(module.params['creates'], creates)
        self.assertEqual(module.params['removes'], removes)
        self.assertEqual(module.params['responses'], responses)
        self.assertEqual(module.params['timeout'], timeout)
        self.assertEqual(module.params['echo'], echo)

    def test_pexpect_run(self):
        module = AnsibleModule(
            argument_spec=dict(
                command=dict(required=True),
                chdir=dict(type='path'),
                creates=dict(type='path'),
                removes=dict(type='path'),
                responses=dict(type='dict', required=True),
                timeout=dict(type='int', default=30),
                echo=dict(type='bool', default=False),
            )
        )
        b_out = b'output'
        rc = 0
        try:
            b_out, rc = pexpect.run('args', timeout=30, withexitstatus=True,
                                    events=dict(), cwd='chdir', echo=False,
                                    encoding=None)
        except TypeError:
            b_out, rc = pexpect._run('args', timeout=30, withexitstatus=True,
                                     events=dict(), extra_args=None, logfile=None,
                                     cwd='chdir', env=None, _spawn=pexpect.spawn,
                                     echo=False)
        self.assertEqual(b_out, b'output')
        self.assertEqual(rc, 0)

if __name__ == '__main__':
    unittest.main()